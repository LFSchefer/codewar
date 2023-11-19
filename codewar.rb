def to_underscore(string)
  new_string = []
   string.to_s.each_char do |char|
    if char.upcase == char && char.to_i.to_s != char
      new_string << "_"
    end
    new_string << char.downcase
  end
  if new_string[0] == "_"
    new_string.delete_at(0)
  end
  p new_string.join()
end

to_underscore("TestController")
p  "EXPECTED: test_controller"
to_underscore("MoviesAndBooks")
p  "EXPECTED: movies_and_books"
to_underscore("App7Test")
p  "EXPECTED: app7_test"
to_underscore(1)
p  "EXPECTED: 1"

