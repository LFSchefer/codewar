function generateLink(user) {
  const userLink = encodeURIComponent(user);
  return `http://www.codewars.com/users/${userLink}`
}


generateLink('matt c')
console.log(' Expected :http://www.codewars.com/users/matt%20c');
generateLink('g964')
console.log(' Expected :http://www.codewars.com/users/g964');
generateLink('GiacomoSorbi')
console.log(' Expected :http://www.codewars.com/users/GiacomoSorbi');
generateLink('ZozoFouchtra')
console.log(' Expected :http://www.codewars.com/users/ZozoFouchtra');
generateLink('colbydauph')
console.log(' Expected :http://www.codewars.com/users/colbydauph');
