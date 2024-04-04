class Car

  def initialize(color)
    @color = color
  end

  def color
    return @color
  end
end

red_car = Car.new("blue")
puts red_car
