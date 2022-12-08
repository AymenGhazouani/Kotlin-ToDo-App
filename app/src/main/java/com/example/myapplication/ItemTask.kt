package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable
fun CheckBoxDemo() {
    val checkedState = remember { mutableStateOf(true) }
    Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it }
    )
}
@Composable
fun ItemTask(task:Task,vm:TasksViewModel)
{

    Row(modifier= Modifier.fillMaxWidth())
    {
        task.label.let { Text(it, modifier = Modifier.align(alignment = Alignment.CenterVertically)) }
        Spacer(modifier = Modifier.width(4.dp))
        Row(horizontalArrangement = Arrangement.End)
        {
            CheckBoxDemo()
            //Checkbox(checked =, onCheckedChange ={ vm.CheckTask(task)})
            Spacer(modifier = Modifier.width(4.dp))
            IconButton(onClick = {vm.RemoveTask(task)},) {
                Icon(Icons.Filled.Close, contentDescription = "Close")

            }
        }


    }
}