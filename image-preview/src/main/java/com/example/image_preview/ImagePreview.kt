package com.example.image_preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ImagePreview(
    modifier: Modifier,
    image: Painter,
    onImageClicked: () -> Unit
) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .shadow(15.dp)
            .clickable { onImageClicked() }) {
        Image(
            modifier = modifier.fillMaxSize(),
            painter = image,
            contentDescription = ""
        )
    }

}

//@Preview(showBackground = true)
//@Composable
//fun ImagePreviewPreview(modifier: Modifier = Modifier) {
//    ImagePreview(modifier = modifier,
//        image = painterResource(id = R.drawable.ic_launcher_foreground),
//        onImageClicked = {}
//    )
//}

