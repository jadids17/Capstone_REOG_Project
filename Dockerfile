FROM node:alpine
WORKDIR /usr/backend
ENV PORT 8080
COPY package*.json ./

RUN npm install --production
EXPOSE 8080
COPY app .

CMD ["node", "server.js"]