def duplicate_count(text)
  number_of_duplicate = []
   text.chars.each do |letter|
    if text.downcase.chars.count(letter.downcase) > 1
      number_of_duplicate << letter.downcase
    end
  end
  p number_of_duplicate.uniq.size
end

duplicate_count("")
p "expected 0"
duplicate_count("abcde")
p "expected 0"
duplicate_count("abcdeaa")
p "expected 1"
duplicate_count("abcdeaB")
p "expected 2"
duplicate_count("Indivisibilities")
p "expected 2"
