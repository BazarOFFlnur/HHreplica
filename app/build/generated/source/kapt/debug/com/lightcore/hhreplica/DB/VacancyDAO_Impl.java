package com.lightcore.hhreplica.DB;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.lightcore.hhreplica.dataModels.Address;
import com.lightcore.hhreplica.dataModels.Experience;
import com.lightcore.hhreplica.dataModels.Salary;
import com.lightcore.hhreplica.dataModels.Vacancy;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class VacancyDAO_Impl implements VacancyDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Vacancy> __insertionAdapterOfVacancy;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Vacancy> __deletionAdapterOfVacancy;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public VacancyDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVacancy = new EntityInsertionAdapter<Vacancy>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `vacancy` (`id`,`lookingnumber`,`title`,`address`,`company`,`experience`,`publisheddate`,`isfavorite`,`salary`,`schedule`,`type`,`appliednumber`,`description`,`responsibilities`,`questions`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Vacancy entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        if (entity.getLookingNumber() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getLookingNumber());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        final String _tmp = __converters.fromAddress(entity.getAddress());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp);
        }
        if (entity.getCompany() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCompany());
        }
        final String _tmp_1 = __converters.fromExperience(entity.getExperience());
        if (_tmp_1 == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp_1);
        }
        if (entity.getPublishedDate() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getPublishedDate());
        }
        final int _tmp_2 = entity.isFavorite() ? 1 : 0;
        statement.bindLong(8, _tmp_2);
        final String _tmp_3 = __converters.fromSalary(entity.getSalary());
        if (_tmp_3 == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, _tmp_3);
        }
        final String _tmp_4 = __converters.fromStringList(entity.getSchedules());
        if (_tmp_4 == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, _tmp_4);
        }
        if (entity.getType() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getType());
        }
        if (entity.getAppliedNumber() == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, entity.getAppliedNumber());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getDescription());
        }
        if (entity.getResponsibilities() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getResponsibilities());
        }
        final String _tmp_5 = __converters.fromStringList(entity.getQuestions());
        if (_tmp_5 == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, _tmp_5);
        }
      }
    };
    this.__deletionAdapterOfVacancy = new EntityDeletionOrUpdateAdapter<Vacancy>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `vacancy` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Vacancy entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM vacancy";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final Vacancy... vacancies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfVacancy.insert(vacancies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Vacancy vacancy) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfVacancy.handle(vacancy);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<Vacancy> getAll() {
    final String _sql = "SELECT * FROM vacancy";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLookingNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "lookingnumber");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
      final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
      final int _cursorIndexOfExperience = CursorUtil.getColumnIndexOrThrow(_cursor, "experience");
      final int _cursorIndexOfPublishedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publisheddate");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isfavorite");
      final int _cursorIndexOfSalary = CursorUtil.getColumnIndexOrThrow(_cursor, "salary");
      final int _cursorIndexOfSchedules = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfAppliedNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "appliednumber");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfResponsibilities = CursorUtil.getColumnIndexOrThrow(_cursor, "responsibilities");
      final int _cursorIndexOfQuestions = CursorUtil.getColumnIndexOrThrow(_cursor, "questions");
      final List<Vacancy> _result = new ArrayList<Vacancy>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Vacancy _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final Integer _tmpLookingNumber;
        if (_cursor.isNull(_cursorIndexOfLookingNumber)) {
          _tmpLookingNumber = null;
        } else {
          _tmpLookingNumber = _cursor.getInt(_cursorIndexOfLookingNumber);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Address _tmpAddress;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfAddress)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfAddress);
        }
        _tmpAddress = __converters.toAddress(_tmp);
        final String _tmpCompany;
        if (_cursor.isNull(_cursorIndexOfCompany)) {
          _tmpCompany = null;
        } else {
          _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
        }
        final Experience _tmpExperience;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfExperience)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfExperience);
        }
        _tmpExperience = __converters.toExperience(_tmp_1);
        final String _tmpPublishedDate;
        if (_cursor.isNull(_cursorIndexOfPublishedDate)) {
          _tmpPublishedDate = null;
        } else {
          _tmpPublishedDate = _cursor.getString(_cursorIndexOfPublishedDate);
        }
        final boolean _tmpIsFavorite;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp_2 != 0;
        final Salary _tmpSalary;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfSalary)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfSalary);
        }
        _tmpSalary = __converters.toSalary(_tmp_3);
        final List<String> _tmpSchedules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfSchedules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfSchedules);
        }
        _tmpSchedules = __converters.toStringList(_tmp_4);
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final Integer _tmpAppliedNumber;
        if (_cursor.isNull(_cursorIndexOfAppliedNumber)) {
          _tmpAppliedNumber = null;
        } else {
          _tmpAppliedNumber = _cursor.getInt(_cursorIndexOfAppliedNumber);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpResponsibilities;
        if (_cursor.isNull(_cursorIndexOfResponsibilities)) {
          _tmpResponsibilities = null;
        } else {
          _tmpResponsibilities = _cursor.getString(_cursorIndexOfResponsibilities);
        }
        final List<String> _tmpQuestions;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfQuestions)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfQuestions);
        }
        _tmpQuestions = __converters.toStringList(_tmp_5);
        _item = new Vacancy(_tmpId,_tmpLookingNumber,_tmpTitle,_tmpAddress,_tmpCompany,_tmpExperience,_tmpPublishedDate,_tmpIsFavorite,_tmpSalary,_tmpSchedules,_tmpType,_tmpAppliedNumber,_tmpDescription,_tmpResponsibilities,_tmpQuestions);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Vacancy> loadAllByIds(final int[] vacancyIds) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM vacancy WHERE id IN (");
    final int _inputSize = vacancyIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : vacancyIds) {
      _statement.bindLong(_argIndex, _item);
      _argIndex++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLookingNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "lookingnumber");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
      final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
      final int _cursorIndexOfExperience = CursorUtil.getColumnIndexOrThrow(_cursor, "experience");
      final int _cursorIndexOfPublishedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publisheddate");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isfavorite");
      final int _cursorIndexOfSalary = CursorUtil.getColumnIndexOrThrow(_cursor, "salary");
      final int _cursorIndexOfSchedules = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfAppliedNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "appliednumber");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfResponsibilities = CursorUtil.getColumnIndexOrThrow(_cursor, "responsibilities");
      final int _cursorIndexOfQuestions = CursorUtil.getColumnIndexOrThrow(_cursor, "questions");
      final List<Vacancy> _result = new ArrayList<Vacancy>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Vacancy _item_1;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final Integer _tmpLookingNumber;
        if (_cursor.isNull(_cursorIndexOfLookingNumber)) {
          _tmpLookingNumber = null;
        } else {
          _tmpLookingNumber = _cursor.getInt(_cursorIndexOfLookingNumber);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Address _tmpAddress;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfAddress)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfAddress);
        }
        _tmpAddress = __converters.toAddress(_tmp);
        final String _tmpCompany;
        if (_cursor.isNull(_cursorIndexOfCompany)) {
          _tmpCompany = null;
        } else {
          _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
        }
        final Experience _tmpExperience;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfExperience)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfExperience);
        }
        _tmpExperience = __converters.toExperience(_tmp_1);
        final String _tmpPublishedDate;
        if (_cursor.isNull(_cursorIndexOfPublishedDate)) {
          _tmpPublishedDate = null;
        } else {
          _tmpPublishedDate = _cursor.getString(_cursorIndexOfPublishedDate);
        }
        final boolean _tmpIsFavorite;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp_2 != 0;
        final Salary _tmpSalary;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfSalary)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfSalary);
        }
        _tmpSalary = __converters.toSalary(_tmp_3);
        final List<String> _tmpSchedules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfSchedules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfSchedules);
        }
        _tmpSchedules = __converters.toStringList(_tmp_4);
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final Integer _tmpAppliedNumber;
        if (_cursor.isNull(_cursorIndexOfAppliedNumber)) {
          _tmpAppliedNumber = null;
        } else {
          _tmpAppliedNumber = _cursor.getInt(_cursorIndexOfAppliedNumber);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpResponsibilities;
        if (_cursor.isNull(_cursorIndexOfResponsibilities)) {
          _tmpResponsibilities = null;
        } else {
          _tmpResponsibilities = _cursor.getString(_cursorIndexOfResponsibilities);
        }
        final List<String> _tmpQuestions;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfQuestions)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfQuestions);
        }
        _tmpQuestions = __converters.toStringList(_tmp_5);
        _item_1 = new Vacancy(_tmpId,_tmpLookingNumber,_tmpTitle,_tmpAddress,_tmpCompany,_tmpExperience,_tmpPublishedDate,_tmpIsFavorite,_tmpSalary,_tmpSchedules,_tmpType,_tmpAppliedNumber,_tmpDescription,_tmpResponsibilities,_tmpQuestions);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Vacancy findByName(final String name) {
    final String _sql = "SELECT * FROM vacancy WHERE title LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLookingNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "lookingnumber");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
      final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
      final int _cursorIndexOfExperience = CursorUtil.getColumnIndexOrThrow(_cursor, "experience");
      final int _cursorIndexOfPublishedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publisheddate");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isfavorite");
      final int _cursorIndexOfSalary = CursorUtil.getColumnIndexOrThrow(_cursor, "salary");
      final int _cursorIndexOfSchedules = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfAppliedNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "appliednumber");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfResponsibilities = CursorUtil.getColumnIndexOrThrow(_cursor, "responsibilities");
      final int _cursorIndexOfQuestions = CursorUtil.getColumnIndexOrThrow(_cursor, "questions");
      final Vacancy _result;
      if (_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final Integer _tmpLookingNumber;
        if (_cursor.isNull(_cursorIndexOfLookingNumber)) {
          _tmpLookingNumber = null;
        } else {
          _tmpLookingNumber = _cursor.getInt(_cursorIndexOfLookingNumber);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Address _tmpAddress;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfAddress)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfAddress);
        }
        _tmpAddress = __converters.toAddress(_tmp);
        final String _tmpCompany;
        if (_cursor.isNull(_cursorIndexOfCompany)) {
          _tmpCompany = null;
        } else {
          _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
        }
        final Experience _tmpExperience;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfExperience)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfExperience);
        }
        _tmpExperience = __converters.toExperience(_tmp_1);
        final String _tmpPublishedDate;
        if (_cursor.isNull(_cursorIndexOfPublishedDate)) {
          _tmpPublishedDate = null;
        } else {
          _tmpPublishedDate = _cursor.getString(_cursorIndexOfPublishedDate);
        }
        final boolean _tmpIsFavorite;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp_2 != 0;
        final Salary _tmpSalary;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfSalary)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfSalary);
        }
        _tmpSalary = __converters.toSalary(_tmp_3);
        final List<String> _tmpSchedules;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfSchedules)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfSchedules);
        }
        _tmpSchedules = __converters.toStringList(_tmp_4);
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final Integer _tmpAppliedNumber;
        if (_cursor.isNull(_cursorIndexOfAppliedNumber)) {
          _tmpAppliedNumber = null;
        } else {
          _tmpAppliedNumber = _cursor.getInt(_cursorIndexOfAppliedNumber);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpResponsibilities;
        if (_cursor.isNull(_cursorIndexOfResponsibilities)) {
          _tmpResponsibilities = null;
        } else {
          _tmpResponsibilities = _cursor.getString(_cursorIndexOfResponsibilities);
        }
        final List<String> _tmpQuestions;
        final String _tmp_5;
        if (_cursor.isNull(_cursorIndexOfQuestions)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getString(_cursorIndexOfQuestions);
        }
        _tmpQuestions = __converters.toStringList(_tmp_5);
        _result = new Vacancy(_tmpId,_tmpLookingNumber,_tmpTitle,_tmpAddress,_tmpCompany,_tmpExperience,_tmpPublishedDate,_tmpIsFavorite,_tmpSalary,_tmpSchedules,_tmpType,_tmpAppliedNumber,_tmpDescription,_tmpResponsibilities,_tmpQuestions);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
