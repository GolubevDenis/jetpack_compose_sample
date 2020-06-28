package com.blackcube.moviessearcher.navigation

import androidx.compose.Composable
import androidx.compose.MutableState
import androidx.compose.mutableStateOf
import java.util.*

typealias BackStackEntity = @Composable() (() -> Unit)

interface Navigation {

    val currentScreen: MutableState<BackStackEntity>
    fun navigateTo(screen: BackStackEntity)
    fun navigateBack(): Boolean

}

class NavigationImpl(
    initialScreen: BackStackEntity,
    private val isSplashScreen: Boolean = false
) : Navigation {

    private val backStack: Stack<BackStackEntity> by lazy {
        val stack = Stack<BackStackEntity>()
        stack.push(initialScreen)
        stack
    }

    override val currentScreen = mutableStateOf<BackStackEntity>(backStack.peek())

    override fun navigateTo(screen: BackStackEntity){
        backStack.push(screen)
        currentScreen.value = screen
    }

    override fun navigateBack(): Boolean {
        if(backStack.size <= 2 && isSplashScreen)
            return false
        if(backStack.size <= 1)
            return false

        backStack.pop()

        currentScreen.value = backStack.peek()
        return true
    }

}