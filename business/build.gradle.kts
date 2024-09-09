dependencies {
    implementation(project(":domain"))
    implementation(project(":support"))
    testImplementation(testFixtures(project(":domain")))
}
