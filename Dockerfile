FROM node:14.21.2-alpine

WORKDIR /usr/app

COPY package*.json ./

RUN npm install 
EXPOSE 8080
COPY . .

CMD ["node", "server.js"]
