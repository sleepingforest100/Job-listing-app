package kz.just_code.joblistingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper

import kz.just_code.joblistingapp.databinding.FragmentDetailsBinding
import kz.just_code.joblistingapp.decoration.HeaderDecoration
import kz.just_code.joblistingapp.decoration.OffsetDecoration


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: FragmentDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jobListAdapter = JobListAdapter()
        with(binding) {
            listView.adapter = jobListAdapter
            listView.layoutManager =
                LinearLayoutManager(this@SecondActivity, LinearLayoutManager.VERTICAL, false)
            listView.addItemDecoration(OffsetDecoration(start = 2, top = 10, end = 2, bottom = 10))
            LinearSnapHelper().attachToRecyclerView(listView)
        }

        jobListAdapter.submitList(getJobList())
    }


    private fun getJobList(): List<JobListDto> {
        return listOf(
            JobListDto(0, R.string.Android, R.string.description),
            JobListDto(1, R.string.android1, R.string.description),
            JobListDto(2, R.string.android2, R.string.description),
            JobListDto(3, R.string.android3, R.string.description),
            JobListDto(4, R.string.android4, R.string.description),
            JobListDto(5, R.string.designer, R.string.description),
            JobListDto(6, R.string.designer1, R.string.description),
            JobListDto(7, R.string.designer2, R.string.description),
            JobListDto(8, R.string.designer3, R.string.description),
            JobListDto(9, R.string.designer4, R.string.description),
            JobListDto(10, R.string.iOSDeveloper, R.string.description),
            JobListDto(11, R.string.IOS1, R.string.description),
            JobListDto(12, R.string.IOS2, R.string.description),
            JobListDto(13, R.string.IOS3, R.string.description),
            JobListDto(14, R.string.IOS4, R.string.description),
            JobListDto(15, R.string.BackendDeveloper, R.string.description),
            JobListDto(16, R.string.backend1, R.string.description),
            JobListDto(16, R.string.backend2, R.string.description),
            JobListDto(16, R.string.backend3, R.string.description),
            JobListDto(16, R.string.backend4, R.string.description),
            JobListDto(16, R.string.Tester, R.string.description),
            JobListDto(16, R.string.tester1, R.string.description),
            JobListDto(16, R.string.tester2, R.string.description),
            JobListDto(16, R.string.tester3, R.string.description),
            JobListDto(16, R.string.tester4, R.string.description)


        )
    }

}