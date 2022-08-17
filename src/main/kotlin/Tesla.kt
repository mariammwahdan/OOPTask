class Tesla(model:String,color:String, speed:Double):Car(model,color,speed) {
    override fun getFuelType(): String {
        return "Dont run by fuel but by Electricity"
    }
}