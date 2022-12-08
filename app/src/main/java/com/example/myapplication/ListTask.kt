package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListTask(vm:TasksViewModel)
{

    LazyColumn(modifier = Modifier.padding(all=8.dp)) {
        items(vm.ListTask) {
            task-> ItemTask(task,vm)
        }
    }
}