include(
    ":ChatKit:ChatCore",
    ":ChatKit:ChatUI"
)
include(
    ":Core:Base",
    ":Core:Data",
    ":Core:Network"
)
include(
    ":Features:Auth",
    ":Features:Chats",
    ":Features:Profiles",
    ":Features:Conversations",
    ":Features:Settings",
    ":Features:Contacts",
    ":Features:CreatingAccount",
    ":Features:OnBoarding"
)
include(":UIKit")
include(":Security")
include(":app")
rootProject.name = "X-Messenger"
rootProject.buildFileName = "build.gradle.kts"