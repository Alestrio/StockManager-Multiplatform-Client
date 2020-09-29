package stockable

data class StockableProperty<T>(var databaseName: String, var value:T) {
    fun getValue(): T {
        return this.value
    }

    fun setValue(newValue:T){
        this.value = newValue
    }
}

class PropertySet: ArrayList<StockableProperty<*>>() {
    fun getValueType(id:Int):Any{
        return when(this[id].getValue()){
            is String -> String
            is Int -> Int
            is Double -> Double
            is Boolean -> Boolean
            else -> throw Exception("Unknown Type")
        }
    }

    fun getValue(id:Int): Any? {
        return this[id].getValue()
    }

}