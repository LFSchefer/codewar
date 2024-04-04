function evaluate(arr){
  const numbers = [];
  const operators = [];
  let result = 0;
  if (arr.length % 2 == 0) {
    console.log(undefined);
    return undefined
  }
  arr.forEach((element, index) => {
    if (index %  2 == 0 && !isNaN(parseInt(element)) ) {
      numbers.push(element);
    }
    else if (index % 2 == 1 && isNaN(parseInt(element))) {
      operators.push(element);
    }
    else {
      console.log(undefined);
      return undefined;
    }
  });
    // console.log(numbers);
    // console.log(operators);
    for (let index = numbers.length; index >= 0; index--) {
      console.log(numbers[index]);
      result += numbers[index] operators[index] numbers[index -1];
    }

}

evaluate(['10', '+', '20', '*','3']);
console.log("Solution: 70");
evaluate(['10', '+', '20', '*','3', '+', '30']);
console.log("Solution: 100");
evaluate(['10', '+', '20', '*','3', '*']);
console.log("Solution: Undefined");
evaluate(['+', '10', '+', '20', '*','3']);
console.log("Solution: Undefined");
evaluate(['10', '10', '+', '20', '*','3']);
console.log("Solution: Undefined");
