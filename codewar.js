var Calculator = {
  average: function() {
    let keys = Object.keys(this.average.arguments);
    if (keys.length === 0) {
      return 0
    };
    let sum = 0;
   keys.forEach(key => {
     sum += this.average.arguments[keys[key]]
    })
    return sum/keys.length
  }
 };

 Calculator.average(3,4,9)
 Calculator.average()
