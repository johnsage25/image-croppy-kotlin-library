package com.pearldrift.aspectratiorecyclerviewlib.aspectratio

import com.pearldrift.aspectratiorecyclerviewlib.R
import com.pearldrift.aspectratiorecyclerviewlib.aspectratio.model.AspectRatio
import com.pearldrift.aspectratiorecyclerviewlib.aspectratio.model.AspectRatioItem

object AspectRatioDataProvider {

    private val aspectRatioViewStateList = arrayListOf<AspectRatioItemViewState>()

    fun getAspectRatioViewStateList(
        activeColor: Int,
        passiveColor: Int,
        socialActiveColor: Int,
        socialPassiveColor: Int
    ): List<AspectRatioItemViewState> {
        if (aspectRatioViewStateList.isEmpty()) {
            loadAspects(activeColor, passiveColor, socialActiveColor, socialPassiveColor)
        }
        return aspectRatioViewStateList
    }

    private fun loadAspects(
        activeColor: Int,
        passiveColor: Int,
        socialActiveColor: Int,
        socialPassiveColor: Int
    ) {
        aspectRatioViewStateList.clear()
        getAspectRatioList(
            activeColor,
            passiveColor,
            socialActiveColor,
            socialPassiveColor
        ).forEach {
            aspectRatioViewStateList.add(
                AspectRatioItemViewState(
                    aspectRatioItem = it,
                    isSelected = false
                )
            )
        }
    }

    private fun getAspectRatioList(
        activeColor: Int,
        passiveColor: Int,
        socialActiveColor: Int,
        socialPassiveColor: Int
    ): List<AspectRatioItem> {
        return arrayListOf(
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_free,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_free,
                aspectRatioNameRes = R.string.aspect_free,
                socialMediaImageRes = R.drawable.ic_aspect_icon_free,
                aspectRatio = AspectRatio.ASPECT_FREE,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),



            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_5_4,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_5_4,
                aspectRatioNameRes = R.string.aspect_5_4,
                aspectRatio = AspectRatio.ASPECT_5_4,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_3_4,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_3_4,
                aspectRatioNameRes = R.string.aspect_3_4,
                aspectRatio = AspectRatio.ASPECT_3_4,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_4_3,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_4_3,
                aspectRatioNameRes = R.string.aspect_4_3,
                aspectRatio = AspectRatio.ASPECT_4_3,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),



            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_3_2,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_3_2,
                aspectRatioNameRes = R.string.aspect_3_2,
                aspectRatio = AspectRatio.ASPECT_3_2,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_9_16,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_9_16,
                aspectRatioNameRes = R.string.aspect_9_16,
                aspectRatio = AspectRatio.ASPECT_9_16,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_16_9,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_16_9,
                aspectRatioNameRes = R.string.aspect_16_9,
                aspectRatio = AspectRatio.ASPECT_16_9,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_1_2,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_1_2,
                aspectRatioNameRes = R.string.aspect_1_2,
                aspectRatio = AspectRatio.ASPECT_1_2,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),

            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_a_4,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_a_4,
                aspectRatioNameRes = R.string.aspect_a_4,
                aspectRatio = AspectRatio.ASPECT_A_4,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            ),
            AspectRatioItem(
                aspectRatioSelectedWidthRes = R.dimen.width_aspect_a_5,
                aspectRatioUnselectedHeightRes = R.dimen.height_aspect_a_5,
                aspectRatioNameRes = R.string.aspect_a_5,
                aspectRatio = AspectRatio.ASPECT_A_5,
                activeColor = activeColor,
                passiveColor = passiveColor,
                socialActiveColor = socialActiveColor,
                socialPassiveColor = socialPassiveColor
            )
        )
    }
}