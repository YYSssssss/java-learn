console.log('Hello world');
console.error('this is an error');
console.warn('this is an warning');
const s = 'Hello World';
console.log(s.toUpperCase());
console.log(s.split(''));
const s1 = 'technology, computers, it, code';
console.log(s1.split(', '))
// alert('hello');

// 区别 var，let，const
let age = 30;
console.log(age);

let score;
score = 10;
console.log(score);

//String,Numbers,Boolean,null,undefined
const name  = 'John';
const age1 = 30;
const rating = 4.5;
const isCool = true;
const x = null;
const y = undefined;
let z;
console.log(typeof name);

// Concatenation
console.log('My name is ' + name + ' and I am ' + age);
// Template String
const hello = `my name is ${name} and i am ${age}`;
console.log(hello);

//Arrays - variables that hold multiple values
const numbers = new Array(1,2,3,4,5);
console.log(numbers);

const fruits = ['apples','oranges','pears',10,true];
fruits[5] = 'grapes';
fruits.push('mangos');
fruits.unshift('strawberries');
fruits.pop();
console.log(Array.isArray('hello'));
console.log(fruits.indexOf('orange'));
console.log(fruits); 

const person = {
    firstName:'John',
    lastName:'Doe',
    age:30,
    hobbies:['music','movies','sports'],
    address:{
        streey:'50 main st',
        city:'Boston',
        state:'MA'

    }
}
console.log(person.firstName,person.address,);

const{firstName , lastName , address:{ city }} = person;
console.log(city);

person.email = '864486277@qq.com';

//
const todos = [
    {
        id: 1,
        text:'Take out trash1',
        isCompleted:true
    },
    {
        id: 2,
        text:'Take out trash2',
        isCompleted:false
    },
    {
        id: 3,
        text:'Take out trash3',
        isCompleted:true
    },
];
for(let todo of todos){
    console.log(todo.id)
}

//For
for(let i=0;i<10;i++){
    console.log(i);
}

//while
let i = 0;
while(i<10){
    console.log(`while Loop Number:${i}`);
    i++;
}

//foreach, map, filter
todos.forEach(function(todo){
    console.log(todo.text)
});
// const todoText = todos.map(function(todo){
//     return todo.text;
// });
const todoText1 = todos.map(function(todo){
    return todo.isCompleted === false;
});

const todoText2 = todos.filter(function(todo){
    return todo.isCompleted === true;//需要匹配数据类型
}).map(function(todo){
    return todo.text;
})
console.log(todoText2);

//
const aikes = 10;
const color = aikes > 10 ?'red':'blue';

//箭头函数
const addNums = (num1 = 1,num2 = 1) => num1+num2;
console.log(addNums(5,5));

//Constructor function
function Person(firstName, lastName, dob){
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = new Date(dob);
    this.getBirthYear = function(){
        return this.dob.getFullYear();
    }
    this.getFullName = function(){
        return `${this.firstName}${this.lastName}`
    }
}
Person.prototype.getBirthYear = function(){
    return this.dob.getFullYear();
}
Person.prototype.getBirthYear = function(){
    return `${this.firstName}${this.lastName}`;
}
//Instantiate object
const person1 = new Person('Yushan','Yu','7-16-1997')
console.log(person1.dob);
console.log(person1.getBirthYear());
console.log(person1.getFullName());

//Single element
console.log(document.getElementById('my-form'));
console.log(document.querySelector('container'));
//Multiple element
// console.log(document.querySelectorAll(',item'));
// console.log(document.getElementsByClassName('item'));
// console.log(document.getElementsByClassName('li'));

// MANIPULATING THE DOM
const ul = document.querySelector('.items');
// ul.remove();
// ul.lastElementChild.remove();
ul.firstElementChild.textContent = 'Hello';
ul.children[1].innerText = 'Brad';
ul.lastElementChild.innerHTML = '<h1>Hello</h1>';

const btn = document.querySelector('.btn');
btn.style.background = 'red';

//
// var d = document.createElement('style');
// d.setAttribute('type', 'text/css');
// d.innerHTML = 'p { color: red }';
// document.getElementsByTagName('head')[0].appendChild(d);