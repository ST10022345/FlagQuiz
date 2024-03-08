package com.example.flagquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String =  "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"what country does this flag belong to ?",
            R.drawable.cubaflag,"Argentina","South Sudan","Cuba","poland",
            3

        )
        questionList.add(que1)

        val que2 = Question(
            2,"what country does this flag belong to ?",
            R.drawable.ethiopiaflag,"Ghana","United Kingdom","Spain","Ethiopia",
            4)

        questionList.add(que2)

        val que3 = Question(
            3,"what country does this flag belong to ?",
            R.drawable.flaglesotho,"Lesotho","china","Zimbabwe","USA",
            1)

        questionList.add(que3)

        val que4 = Question(
            4,"what country does this flag belong to ?",
            R.drawable.flaguruguay,"Congo","Uruguay","Canada","Brazil",
            2)

        questionList.add(que4)

        val que5 = Question(
            5,"what country does this flag belong to ?",
            R.drawable.flagsouthafrica,"Isreal","Egypt","South Africa","France",
            3)

        questionList.add(que5)

        val que6 = Question(
            6,"what country does this flag belong to ?",
            R.drawable.indiaflag,"India","Bangladesh","Nepal","Russia",
            1)

        questionList.add(que6)

        val que7 = Question(
            7,"what country does this flag belong to ?",
            R.drawable.monacoflag,"Poland","Monaco","Belgium","North Korea",
            2)

        questionList.add(que7)

        val que8 = Question(
            8,"what country does this flag belong to ?",
            R.drawable.koreaflag,"South Korea","Fiji","chile","Dubai",
            1)

        questionList.add(que8)

        val que9 = Question(
            9,"what country does this flag belong to ?",
            R.drawable.seychellesflag,"Seychelles","Nigeria","chile","Greece",
            1)

        questionList.add(que9)

        val que10 = Question(
            10,"what country does this flag belong to ?",
            R.drawable.srilankaflag,"Turkey","Sri Lanka","Italy","Botswana",
            2)

        questionList.add(que10)


        return questionList
    }
}