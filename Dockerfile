FROM node:alpine
WORKDIR /server.js
ENV PORT 8080
COPY package*.json ./

RUN npm install --production
EXPOSE 8080
COPY app .

CMD ["node", "server.js"]