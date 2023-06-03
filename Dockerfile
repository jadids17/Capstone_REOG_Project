FROM node:alpine
WORKDIR /usr/backend
COPY package*.json ./

RUN npm install --production

COPY app .

CMD ["node", "server.js"]