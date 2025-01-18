package com.tushant.gamehok.utils

import androidx.compose.ui.graphics.Outline.Generic
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class CustomShape : Shape {
    override fun createOutline(
        size: androidx.compose.ui.geometry.Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): androidx.compose.ui.graphics.Outline {
        val width = size.width
        val height = size.height

        val path = Path().apply {
            moveTo(9.198f, 1.75f)
            cubicTo(9.687f, 0.684f, 10.752f, 0f, 11.925f, 0f)
            lineTo(width - 3.587f, 0f)
            cubicTo(width - 1.424f, 0f, width - 0.029f, 2.22f, width - 0.839f, 4.202f)
            lineTo(width - 8.714f, height - 1.798f)
            cubicTo(
                width - 9.191f,
                height - 0.706f,
                width - 10.27f,
                height,
                width - 11.462f,
                height
            )
            lineTo(3.675f, height)
            cubicTo(1.489f, height, 0.037f, height - 2.263f, 0.948f, height - 4.25f)
            close()
        }
        return Generic(path)
    }
}

class RoundedRectangleShape : Shape {
    override fun createOutline(
        size: androidx.compose.ui.geometry.Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): androidx.compose.ui.graphics.Outline {
        val path = Path().apply {
            val radius = size.height / 2
            moveTo(radius, 0f)
            lineTo(size.width - radius, 0f)
            arcTo(
                rect = androidx.compose.ui.geometry.Rect(
                    size.width - 2 * radius,
                    0f,
                    size.width,
                    2 * radius
                ),
                startAngleDegrees = -90f,
                sweepAngleDegrees = 180f,
                forceMoveTo = false
            )
            lineTo(radius, size.height)
            arcTo(
                rect = androidx.compose.ui.geometry.Rect(
                    0f,
                    0f,
                    2 * radius,
                    2 * radius
                ),
                startAngleDegrees = 90f,
                sweepAngleDegrees = 180f,
                forceMoveTo = false
            )
            close()
        }
        return Generic(path)
    }
}
