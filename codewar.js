var reg = /".+"/g;
function getQuotes(string) {
  console.log(string.match(reg))
}

getQuotes('"example quote #1" some text "example quote #2"');
