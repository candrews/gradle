plugins {
    id("org.springframework.boot") version("2.4.5")
    java
}

version = "1.0.2"
group = "org.gradle.samples"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.4.5"))

    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(mapOf("group" to "org.junit.vintage", "module" to "junit-vintage-engine"))
    }
}

tasks.test {
    useJUnitPlatform()
}
