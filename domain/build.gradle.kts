dependencies {
    implementation(project(":support"))

    // jpa
    api("org.springframework.boot:spring-boot-starter-data-jpa")

    // ULID Creator
    implementation("com.github.f4b6a3:ulid-creator:5.2.3")

    // Test Fixture
    api("org.instancio:instancio-junit:4.8.0")
}
