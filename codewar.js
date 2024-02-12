const obj = {
  a: 12,
  b: 24,
  c: 18,
  d: 4,
  e: 34
}

obj.x = 55;

const result = Object.entries(obj).sort((a,b)=>b[1]-a[1])

console.log(result)

result.forEach(val => {
  console.log(`${val[0]}: ${val[1]}`)
})
