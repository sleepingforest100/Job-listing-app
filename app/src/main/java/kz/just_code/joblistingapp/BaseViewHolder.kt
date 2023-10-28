package kz.just_code.joblistingapp

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<VB: ViewBinding, T>(protected open val binding: VB) :
    RecyclerView.ViewHolder(binding.root){
    abstract fun bindView(item: T)
}

abstract class BaseJobViewHolder<VB: ViewBinding>( override val binding: VB):
    BaseViewHolder<VB, JobListDto>(binding) {
}
