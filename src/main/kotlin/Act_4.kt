package org.example.src.main.kotlin
fun main(){

    val coffees = listOf("NESCAFE","BLANCA","PREMIUM","GREATEST","MILO")
    val fruits = listOf("MANGO","APPLE","BANANA","GRAPES","WATERMELON")

    do {

        println("*****Welcome to our Inventory system*****\n\nChoose a product:\n[1]. Coffee\n[2]. Fruits")
        println("-----------------------------------------")
        val opt:Int = readLine()!!.toInt() ?: 0

        var coffeeName: String?
        var fruitName: String?
        var quantity: Int?
        val nescafePrice:Int = 10
        val blancaPrice:Int = 18
        val premiumPrice:Int = 5
        val greatestPrice:Int = 15
        val miloPrice:Int = 12
        val mangoPrice:Int = 50
        val applePrice:Int = 40
        val bananaPrice:Int = 60
        val grapesPrice:Int = 70
        val watermelonPrice:Int = 80

        if (opt == 1) {
            outer@ do {
                println("Enter the brand of coffee: ")
                coffeeName = readLine().toString().toUpperCase()

                when (coffeeName) {
                    coffees[0] -> {
                        println("This can be bought\nPrice: $nescafePrice");break@outer
                    }

                    coffees[1] -> {
                        println("This can be bought\nPrice: $blancaPrice");break@outer
                    }

                    coffees[2] -> {
                        println("This can be bought\nPrice: $premiumPrice");break@outer
                    }

                    else -> {
                        println("\nThis is not available")

                        when (coffeeName) {

                            coffees[3] -> println("[1]. Supply Chain Disruptions\n[2]. Quality Standars and Inspections\n[3]. No deliver")

                            coffees[4] -> println("[1]. Production issues\n[2]. Stock Depletion\n[3]. Distribution Challenges")

                            else -> println("[1]. Out of Stock\n[2]. Price Fluctuations\n[3]. No deliver")

                        }
                        println("-----------------------------------------")
                    }
                }
            } while (!(coffeeName!!.equals(coffees)))

            println("\nEnter quantity:")
            quantity = readLine()!!.toInt() ?: 0

            if(coffeeName.equals("NESCAFE")) {
                println("\nProduct name: $coffeeName")
                println("Product quantity: $quantity")
                var mul = nescafePrice * quantity
                println("Amount: $mul")

            }else if(coffeeName.equals("BLANCA")){
                println("\nProduct name: $coffeeName")
                println("Product quantity: $quantity")
                var mul1 = blancaPrice * quantity
                println("Amount: $mul1")

            }else if(coffeeName.equals("PREMIUM")){
                println("\nProduct name: $coffeeName")
                println("Product quantity: $quantity")
                var mul2 = premiumPrice * quantity
                println("Amount: $mul2")
            }

        } else if (opt == 2) {

            outer@ do {

                println("Enter the fruit: ")
                fruitName = readLine().toString().toUpperCase()

                when (fruitName) {

                    fruits[0] -> {
                        println("This can be bought\nPrice: $mangoPrice");break@outer
                    }

                    fruits[1] -> {
                        println("This can be bought\nPrice: $applePrice");break@outer
                    }

                    fruits[2] -> {
                        println("This can be bought\nPrice: $bananaPrice");break@outer
                    }

                    else -> {
                        println("\nThis is not available")

                        when (fruitName) {
                            coffees[3] -> println("[1]. Distribution Challenges\n[2]. Quality over quantity\n[3]. Seasonal harvest")

                            coffees[4] -> println("[1]. Transportation and Storage Challenges\n[2]. Regional Variations\n[3]. Geographical Limitations")

                            else -> println("[1]. Out of Stock\n[2]. Price Fluctuations\n[3]. No deliver")

                        }
                        println("-----------------------------------------")
                    }

                }
            } while (!(fruitName!!.equals(fruits)))

            println("\nEnter quantity:")
            quantity = readLine()!!.toInt() ?: 0

            if(fruitName.equals("MANGO")) {
                println("\nProduct name: $fruitName")
                println("Product quantity: $quantity")
                var mul3 = mangoPrice * quantity
                println("Amount: $mul3")

            }else if(fruitName.equals("APPLE")){
                println("\nProduct name: $fruitName")
                println("Product quantity: $quantity")
                var mul4 = applePrice * quantity
                println("Amount: $mul4")

            }else if(fruitName.equals("BANANA")){
                println("\nProduct name: $fruitName")
                println("Product quantity: $quantity")
                var mul5 = bananaPrice * quantity
                println("Amount: $mul5")

            }
        }

        println("\nDo you want to add another product? {Y|N}")
        var response = readLine().toString()

    }while(when (response.toString().substring(0,1).uppercase()){
            "Y" -> true
            else -> false
        })
}