package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel

@Composable
fun MainScreen()
{
    var vm = TasksViewModel()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold(

        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = { Text("Tasks App") },)  },

        drawerContent = { Text(text = "drawerContent") },
        content = { Column {
            InputAddComposer(vm)
            ListTask(vm)

        }})

}