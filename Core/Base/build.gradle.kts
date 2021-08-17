import extensions.addAllUIDependencies
import extensions.addBaseCoreDependencies

plugins {
    id(Plugins.CORE_MODULE)
}

dependencies {

    addBaseCoreDependencies()

    addAllUIDependencies()
}