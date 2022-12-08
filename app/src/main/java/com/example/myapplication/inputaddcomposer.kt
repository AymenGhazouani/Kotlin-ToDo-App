package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputAddComposer(vm:TasksViewModel) {

    var text by rememberSaveable { mutableStateOf("") }

    Column(modifier= Modifier.padding(8.dp)) {
        OutlinedTextField(value = text, onValueChange ={text =it}, label = { Text("Task") },
        )
        Button(onClick = {vm.addTask(Task(vm.ListTask.size,text,false))}){
            Icon(Icons.Filled.Add,contentDescription = "Icon add")
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Add Task")
        }
    }
}