package com.pearldrift.aspectratiorecyclerviewlib.aspectratio.model

enum class AspectRatio(val widthRatio: Float, val heightRatio: Float) {

    ASPECT_FREE(-1f, -1f),
    ASPECT_5_4(5f, 4f),
    ASPECT_3_4(3f, 4f),
    ASPECT_4_3(4f, 3f),
    ASPECT_3_2(3f, 2f),
    ASPECT_9_16(9f, 16f),
    ASPECT_16_9(16f, 9f),
    ASPECT_1_2(1f, 2f),
    ASPECT_A_4(0.7f, 1f),
    ASPECT_A_5(0.7f, 1f)
}