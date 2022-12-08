package com.example.myapplication

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class TasksViewModel : ViewModel() {
    var ListTask = mutableStateListOf<Task>()

    fun addTask(task:Task)
    {
        ListTask.add(task)
    }
    fun RemoveTask(task:Task)
    {
        ListTask.remove(task)
    }

    fun CheckTask(task:Task)
    {

}
}