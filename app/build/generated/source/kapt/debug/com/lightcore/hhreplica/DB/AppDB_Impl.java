package com.lightcore.hhreplica.DB;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDB_Impl extends AppDB {
  private volatile VacancyDAO _vacancyDAO;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `vacancy` (`id` TEXT NOT NULL, `lookingnumber` INTEGER, `title` TEXT NOT NULL, `address` TEXT NOT NULL, `company` TEXT NOT NULL, `experience` TEXT NOT NULL, `publisheddate` TEXT NOT NULL, `isfavorite` INTEGER NOT NULL, `salary` TEXT NOT NULL, `schedule` TEXT NOT NULL, `type` TEXT NOT NULL, `appliednumber` INTEGER, `description` TEXT NOT NULL, `responsibilities` TEXT NOT NULL, `questions` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e85a447fbe57104ef0a7f42c1e99e362')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `vacancy`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsVacancy = new HashMap<String, TableInfo.Column>(15);
        _columnsVacancy.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("lookingnumber", new TableInfo.Column("lookingnumber", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("company", new TableInfo.Column("company", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("experience", new TableInfo.Column("experience", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("publisheddate", new TableInfo.Column("publisheddate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("isfavorite", new TableInfo.Column("isfavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("salary", new TableInfo.Column("salary", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("schedule", new TableInfo.Column("schedule", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("appliednumber", new TableInfo.Column("appliednumber", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("responsibilities", new TableInfo.Column("responsibilities", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVacancy.put("questions", new TableInfo.Column("questions", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVacancy = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVacancy = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVacancy = new TableInfo("vacancy", _columnsVacancy, _foreignKeysVacancy, _indicesVacancy);
        final TableInfo _existingVacancy = TableInfo.read(db, "vacancy");
        if (!_infoVacancy.equals(_existingVacancy)) {
          return new RoomOpenHelper.ValidationResult(false, "vacancy(com.lightcore.hhreplica.dataModels.Vacancy).\n"
                  + " Expected:\n" + _infoVacancy + "\n"
                  + " Found:\n" + _existingVacancy);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e85a447fbe57104ef0a7f42c1e99e362", "615f2ca69d6af5ea19f73df233011089");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "vacancy");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `vacancy`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(VacancyDAO.class, VacancyDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public VacancyDAO vacancyDao() {
    if (_vacancyDAO != null) {
      return _vacancyDAO;
    } else {
      synchronized(this) {
        if(_vacancyDAO == null) {
          _vacancyDAO = new VacancyDAO_Impl(this);
        }
        return _vacancyDAO;
      }
    }
  }
}
