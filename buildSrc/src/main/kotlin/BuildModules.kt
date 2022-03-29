object BuildModules {
    const val APP = ":app"

    object Features {
        // add all your features
        const val PLAYER = ":features:playercontrol"
    }

    object Commons {
        // all commons like view,UI,navigation,analytic etc
        const val UI = ":commons:ui" // base ui component
        const val VIEWS = ":commons:views" // shared views .. this is kind of enhancment
        const val NAVIGATION = ":commons:navigation"
    }

    object Libraries {
        // to add module for test
        const val TEST_UTILS = ":libraries:testUtils"
    }
}
