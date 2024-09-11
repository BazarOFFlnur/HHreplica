package com.lightcore.hhreplica

import android.content.Context
import com.lightcore.hhreplica.dataModels.Address
import com.lightcore.hhreplica.dataModels.Experience
import com.lightcore.hhreplica.dataModels.Offers
import com.lightcore.hhreplica.dataModels.Salary
import com.lightcore.hhreplica.dataModels.Vacancy
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream

class Data {
    // Чтение mock.json из папки assets
    fun loadJSONFromAsset(context: Context): String? {
        return try {
            val inputStream: InputStream = context.resources.openRawResource(R.raw.mock_json)
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charsets.UTF_8)
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun parseJsonOffers(context: Context): List<Offers> {
        val jsonString = loadJSONFromAsset(context)
        val offersList = mutableListOf<Offers>()
        if (jsonString != null) {
            val jsonObject = JSONObject(jsonString)
            val offersArray = jsonObject.getJSONArray("offers")
            for (i in 0 until offersArray.length()) {
                val offer = offersArray.getJSONObject(i)
                val id = offer.optString("id")
                val title = offer.optString("title")
                val link = offer.optString("link")
                val button = offer.optJSONObject("button")
                val buttonText = button?.optString("text")
                val img = offer.optString("img")

                offersList.add(Offers(id, title, link, buttonText, img))
            }
        }
        return offersList
    }
    fun parseJsonVacancies(context: Context): List<Vacancy> {
        val jsonString = loadJSONFromAsset(context)
        val vacancyList = mutableListOf<Vacancy>()

        if (jsonString != null) {
            val jsonObject = JSONObject(jsonString)
            val vacanciesArray = jsonObject.getJSONArray("vacancies")

            for (i in 0 until vacanciesArray.length()) {
                val vacancyJson = vacanciesArray.getJSONObject(i)

                val addressJson = vacancyJson.getJSONObject("address")
                val address = Address(
                    town = addressJson.optString("town"),
                    street = addressJson.optString("street"),
                    house = addressJson.optString("house")
                )

                val experienceJson = vacancyJson.getJSONObject("experience")
                val experience = Experience(
                    previewText = experienceJson.optString("previewText"),
                    text = experienceJson.optString("text")
                )

                val salaryJson = vacancyJson.optJSONObject("salary")
                val salary = Salary(
                    short = salaryJson?.optString("short"),
                    full = salaryJson?.optString("full")
                )

                val schedulesArray = vacancyJson.getJSONArray("schedules")
                val schedules = mutableListOf<String>()
                for (j in 0 until schedulesArray.length()) {
                    schedules.add(schedulesArray.getString(j))
                }

                val questionsArray = vacancyJson.getJSONArray("questions")
                val questions = mutableListOf<String>()
                for (j in 0 until questionsArray.length()) {
                    questions.add(questionsArray.getString(j))
                }

                val vacancy = Vacancy(
                    id = vacancyJson.optString("id"),
                    lookingNumber = vacancyJson.optInt("lookingNumber"),
                    title = vacancyJson.optString("title"),
                    address = address,
                    company = vacancyJson.optString("company"),
                    experience = experience,
                    publishedDate = vacancyJson.optString("publishedDate"),
                    isFavorite = vacancyJson.optBoolean("isFavorite"),
                    salary = salary,
                    schedules = schedules,
                    appliedNumber = if (vacancyJson.has("appliedNumber")) vacancyJson.optInt("appliedNumber") else null,
                    description = vacancyJson.optString("description"),
                    responsibilities = vacancyJson.optString("responsibilities"),
                    type = "null",
                    questions = questions
                )

                vacancyList.add(vacancy)
            }
        }
        return vacancyList
    }

}