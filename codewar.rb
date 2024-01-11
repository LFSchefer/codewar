def is_interesting(numbers, awesome_phrases)
  numArray = numbers.to_s.split('').map{|num| num.to_i}
  if numbers<100
    return 0
  end
  if numArray.filter{|num| num==numArray[0]}.size == numArray.size
    return 2
  end
  increment = true
  decrement = true
  numArray.each_with_index do |num,index|
    if index < numArray.size - 1 && num ==! numArray[index + 1]
      increment = false
    elsif index < 0 && num ==! numArray[index - 1]
      decrement = false
    end
  end
  if increment == true || decrement == true
    return 2
  end
  if numArray.size.even?

  else

  end

end

# https://www.codewars.com/kata/52c4dd683bfd3b434c000292/train/ruby


is_interesting(3, [1337, 256])
p "Expected  0"
is_interesting(1336, [1337, 25])
p "Expected 1"
is_interesting(1337, [1337, 25])
p "Expeted 2"
is_interesting(11208, [1337, 26])
p "Expected 0"
is_interesting(11209, [1337, 26])
p "Expected 1"
is_interesting(11211, [1337, 26])
p "Expected 2"
