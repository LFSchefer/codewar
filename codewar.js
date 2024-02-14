const obj = {
  a: 12,
  b: 24,
  c: 18,
  d: 4,
  e: 34,
  x: 2
}

obj.x === undefined ? obj.x = 55 : obj.x += 55;

// console.log(obj)

const result = Object.entries(obj).sort((a,b)=>b[1]-a[1])

// console.log(result)

result.forEach(val => {
  // console.log(`${val[0]}: ${val[1]}`)
})

const score = {
  mel: {
    color: "#00000",
    score: 12},
  sab: {
    color: "#00000",
    score: 21},
  paul: {
    color: "#00000",
    score: 8},
  nico: {
    color: "#00000",
    score: 42},
  lf: {
    color: "#fffff",
    score: 2},
}

score.lf === undefined ? score.lf = {color: "#fffff", score: 7} : score.lf.score += 7

const test = Object.entries(score).sort((a,b)=>{return b[1].score-a[1].score})
console.log(test)

test.forEach((val,index)=>{
  console.log(index + 1)
})
