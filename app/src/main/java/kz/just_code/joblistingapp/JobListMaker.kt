package kz.just_code.joblistingapp

import android.content.Context

object JobListMaker {
    private val stringList = mutableListOf(
       R.string.designer, R.string.designer1,R.string.designer2,
        R.string.designer3,R.string.designer4,R.string.Android,
        R.string.android1,R.string.android2,R.string.android3, R.string.android4,
        R.string.iOSDeveloper,R.string.IOS1, R.string.IOS2,R.string.IOS3, R.string.IOS4,
        R.string.BackendDeveloper,R.string.backend1, R.string.backend2,
        R.string.backend3, R.string.backend4,R.string.Tester,
        R.string.tester1, R.string.tester2, R.string.tester3, R.string.tester4
    )

    fun getJobList(context: Context): MutableList<String> {
        val list: MutableList<String> = mutableListOf()
        stringList.forEach {
            list.add(context.getString(it))
        }

        return list
    }
}