plugins {
    id("java")
    `java-gradle-plugin`
}

group = "lol.koblizek"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

gradlePlugin {

    plugins {
        create("injectr") {
            id = "lol.koblizek.injectr"
            displayName = "Injectr"
            description = "Plugin for automatic apply of the Injectr dependency"
            implementationClass = "lol.koblizek.injectr.gradle.InjectrPlugin"
            tags = listOf("inject", "bytecode")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}