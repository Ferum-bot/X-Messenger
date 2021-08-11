include(
    ":ChatKit:ChatCore",
    ":ChatKit:ChatUI"
)
include(
    ":Core:base",
    ":Core:data",
    ":Core:network"
)
include(
    ":Features:Auth",
    ":Features:Chats",
    ":Features:Profiles",
    ":Features:Security",
    ":Features:Conversations",
    ":Features:Settings"
)
include(":UIKit")
include(":app")
rootProject.name = "X-Messenger"
rootProject.buildFileName = "build.gradle.kts"