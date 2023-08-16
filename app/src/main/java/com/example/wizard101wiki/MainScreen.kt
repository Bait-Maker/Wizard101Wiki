package com.example.wizard101wiki

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun MainScreen() {
    val activity = remember {
        MyRepository().getAllActivities()
    }
    DisplayLazyGrid(wizActivities = activity)
}//end MainScreen()
//--------------------------------------------------------------------------------------------------

@Composable
fun DisplayLazyGrid(wizActivities: List<WizActivities>) {

    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
        content = {
            items(wizActivities) { activityIndex ->
                GridBoxes(wizActivities = activityIndex)
            }
        }
    )
}//end DisplayLazyGrid()
//--------------------------------------------------------------------------------------------------

@Composable
fun GridBoxes(wizActivities: WizActivities) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .aspectRatio(1f)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(wizActivities.image),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(wizActivities.name))
        }
    }
}//end GridBoxes()
//--------------------------------------------------------------------------------------------------