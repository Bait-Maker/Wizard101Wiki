package com.example.wizard101wiki

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    DisplayLazyGrid()
}//end MainScreen()
//--------------------------------------------------------------------------------------------------

@Composable
fun DisplayLazyGrid() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
        content = {
            items(count = 10) { i ->
                GridBoxes()
            }
        }
    )

}//end DisplayLazyGrid()
//--------------------------------------------------------------------------------------------------

@Composable
fun GridBoxes() {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(5.dp))
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Text(text = stringResource(R.string.pvp))
    }
}//end GridBoxes()
//--------------------------------------------------------------------------------------------------
