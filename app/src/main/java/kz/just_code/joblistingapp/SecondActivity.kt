package kz.just_code.joblistingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kz.just_code.joblistingapp.databinding.FragmentDetailsBinding


class SecondActivity: AppCompatActivity() {
    private lateinit var binding: FragmentDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jobList = JobListMaker.getJobList(this)
        val modifiedList = mutableListOf<JobListDto>()

        jobList.forEachIndexed { index, item ->
            if (index%5 == 0) {
                val title =
                    when (index) {
                        0 -> getString(R.string.designer)
                        5 -> getString(R.string.Android)
                        10 -> getString(R.string.iOSDeveloper)
                        15 -> getString(R.string.BackendDeveloper)
                        20 -> getString(R.string.Tester)
                        else -> ""
                    }
                modifiedList.add(JobListDto(JobListType.CATEGORY_VIEW, title))
            }
            modifiedList.add(JobListDto(JobListType.JOB_VIEW, item))
        }

        val adapter = JobListAdapter(modifiedList) // Use the modified list
        binding.listView.adapter = adapter
        binding.listView.layoutManager = LinearLayoutManager(this)

    }
}