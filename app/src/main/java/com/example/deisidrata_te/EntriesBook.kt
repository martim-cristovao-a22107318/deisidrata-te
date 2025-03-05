import com.example.deisidrata_te.DrinkType
import java.util.*

class EntriesBook(){
    private val entries: MutableList<WaterEntry> =  mutableListOf()

    fun insert(entry: WaterEntry){
        entries.add(entry)
    }
    fun getAll(): List<WaterEntry> = entries

    fun deleteAll(){
        entries.clear()
    }
    fun getPercentageOfLiquids(maxLimit: Int = 2000, date: Date): Int {
        val consumed = entries.filter { it.date == date }.sumOf { it.amount }
        return (consumed * 100) / maxLimit
    }
    fun getCurrentConsumption(maxLimit: Int = 2000, date: Date): String{
        val consumed = entries.filter { it.date == date }.sumOf { it.amount }
        return "$consumed"
    }
    fun calculateTotalConsumedWater(date: Date): Int{
        return entries.filter { it.date == date }.filter { it.drinkType == DrinkType.WATER }.sumOf { it.amount }
    }

}