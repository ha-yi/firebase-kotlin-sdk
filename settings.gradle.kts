include(
    "firebase-app",
    "firebase-auth",
    "firebase-common",
    "firebase-config",
    "firebase-database",
    "firebase-firestore",
    "firebase-functions",
    "firebase-installations",
    "firebase-perf",
    "firebase-crashlytics",
    "firebase-storage",
    "test-utils"
)

sourceControl {
    gitRepository(URI.create("https://github.com/ha-yi/firebase-java-sdk.git")) {
        producesModule("dev.gitlive:firebase-java-sdk")
    }
}
