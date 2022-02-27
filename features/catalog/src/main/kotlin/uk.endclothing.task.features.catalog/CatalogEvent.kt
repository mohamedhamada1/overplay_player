package uk.endclothing.task.features.catalog

// this is class to manage actions between fragment and controller
sealed class CatalogEvent{
    object LoadCatalogList:CatalogEvent()
    object Dismiss:CatalogEvent()
}