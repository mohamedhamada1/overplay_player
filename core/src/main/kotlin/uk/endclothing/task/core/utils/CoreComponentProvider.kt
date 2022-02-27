package uk.endclothing.task.core.utils

import uk.endclothing.task.core.di.CoreComponent


interface CoreComponentProvider {

    fun provideCoreComponent(): CoreComponent
}
