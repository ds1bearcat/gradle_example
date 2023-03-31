import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.named

plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("com.google.guava:guava:30.1.1-jre")
    implementation(kotlin("script-runtime"))
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}