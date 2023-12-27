function lostSheep(friday,saturday,total){
  let sum = 0;
  arguments['0'].forEach(element => {sum += element});
  arguments['1'].forEach(elem => {sum += elem});
  return arguments['2'] - sum
}


lostSheep([1,2],[3,4],15)
console.log("expected 5")
lostSheep([5,1,4],[5,4],29)
console.log("expected  10")
