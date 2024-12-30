function digPow(n, p){
  let pow = 0;
  const digits = Array.from(String(n), Number)
  for (let i = 0; i < digits.length; i++) {
    pow +=  Math.pow(digits[i], p+i)
  }
  console.log((pow / n))
  return Number.isInteger(pow / n) ? pow / n : -1
}


// console.log(1)
digPow(89, 1)
// console.log(-1)
digPow(92, 1)
// console.log(51)
digPow(46288, 3)