package com.example.kotlin_1.android_basics

fun main() {
    var data= mutableMapOf<String,String>(
        "animal" to "A living organism that feeds on organic matter, typically having specialized sense organs and nervous system.",
        "bird" to "A warm-blooded egg-laying vertebrate animal, characterized by feathers and forelimbs modified as wings.",
        "human" to "A member of the species Homo sapiens, distinguished by superior mental development and social organization.",
        "Kotlin" to "A modern, statically typed programming language developed by JetBrains, designed to interoperate with Java.",
        "compute" to "To calculate or reckon a figure or amount.",
        "computer" to "An electronic device for storing and processing data.",
        "language" to "A system of communication used by a particular country or community.",
        "flower" to "The reproductive structure in flowering plants, usually colorful and fragrant.",
        "sun" to "The star around which the Earth orbits, providing light and heat.",
        "moon" to "The natural satellite of the Earth, visible primarily at night.",
        "tree" to "A woody perennial plant, typically having a single stem or trunk and bearing branches.",
        "river" to "A large natural stream of water flowing in a channel to the sea, a lake, or another river.",
        "mountain" to "A large natural elevation of the Earth's surface rising abruptly from the surrounding level.",
        "ocean" to "A vast body of salt water that covers almost three-quarters of Earth's surface.",
        "island" to "A piece of land surrounded by water.",
        "cloud" to "A visible mass of condensed water vapor floating in the atmosphere.",
        "rain" to "Water droplets that fall from clouds in the sky.",
        "fire" to "Combustion that gives off light and heat.",
        "earth" to "The planet on which we live.",
        "planet" to "A celestial body moving in an elliptical orbit around a star.",
        "star" to "A luminous point in the night sky that is a large, distant body like the sun.",
        "galaxy" to "A system of millions or billions of stars, together with gas and dust.",
        "atom" to "The basic unit of a chemical element.",
        "science" to "The study of the natural world through observation and experiment.",
        "energy" to "The strength and vitality required for sustained physical or mental activity.",
        "electricity" to "A form of energy resulting from the existence of charged particles.",
        "gravity" to "The force that attracts a body toward the center of the earth.",
        "bacteria" to "Microscopic single-celled organisms that can be beneficial or harmful.",
        "virus" to "A small infectious agent that replicates only inside living cells.",
        "robot" to "A machine capable of carrying out complex actions automatically."
    )

    println("Enter the word:")
    val userInput:String= readln().lowercase()
    println("The meaning of word $userInput is ${if (data[userInput]!=null) data[userInput] else "Not Found!!!"}")

}