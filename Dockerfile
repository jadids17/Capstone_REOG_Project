FROM node:alpine
WORKDIR /usr/backend/app
COPY package*.json ./

RUN npm install --production

COPY app .

CMD ["node", "server.js"]