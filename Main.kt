fun main() {
    val pr1 = InputBase()
    val pr2 = InputBase()
    val pr3 = InputBase()

    val l1 = InputLaptop()
    val l2 = InputLaptop()
    val l3 = InputLaptop()

    println(pr1.PrintInfo(pr1.name, pr1.price, pr1.quanity))
    println(pr1.CalculateUnitPrice())
    println(pr2.PrintInfo(pr2.name, pr2.price, pr2.quanity))
    println(pr2.CalculateUnitPrice())
    println(pr3.PrintInfo(pr3.name, pr3.price, pr3.quanity))
    println(pr3.CalculateUnitPrice())

    println(l1.PrintInfo(l1.name, l1.price, l1.quanity))
    println(l1.a())
    println(l2.PrintInfo(l2.name, l2.price, l2.quanity))
    println(l2.a())
    println(l3.PrintInfo(l3.name, l3.price, l3.quanity))
    println(l3.a())



}
fun InputBase(): InStockProduct
{
    try {
        print("Введите название товара: ")
        val name = readln()
        print("Введите цену: ")
        val price = readln().toDouble()
        print("Введите количество: ")
        val q = readln().toUInt()
        val pr = InStockProduct()
        pr.name = name
        pr.price = price
        pr.quanity = q
        println()
        return pr
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
        return InStockProduct()
    }
}
fun InputLaptop(): Laptop
{
    try {
        print("Введите название товара: ")
        val name = readln()
        print("Введите цену: ")
        val price = readln().toDouble()
        print("Введите количество: ")
        val q = readln().toUInt()
        print("Введите год выпуска: ")
        val relYear = readln().toUInt()

        val pr = Laptop()
        pr.name = name
        pr.price = price
        pr.quanity = q
        if (relYear > 1980u && relYear < 2025u)
            pr.releaseYear = relYear
        println()
        return pr
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
        return Laptop()
    }
}